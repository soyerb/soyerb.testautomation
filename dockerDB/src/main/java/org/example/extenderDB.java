package org.example;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.mapper.reflect.BeanMapper;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Veritabanına bağlanmak için gerekli bilgiler
        String dbUrl = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11678198";
        String username = "sql11678198";
        String password = "wVJ6TIBGWB";

        // JDBI bağlantısı oluşturma
        Jdbi jdbi = Jdbi.create(dbUrl, username, password);
        jdbi.installPlugin(new SqlObjectPlugin());
        jdbi.registerRowMapper(BeanMapper.factory(User.class));

        // Veritabanında CRUD işlemleri yapmak için kullanılacak handle
        try (Handle handle = jdbi.open()) {
            UserDao userDao = handle.attach(UserDao.class);

            // Veritabanına yeni kullanıcı ekleme
            userDao.createTable();
            userDao.insert(new User("John Doe"));
            userDao.insert(new User("Jane Smith"));
            userDao.insert(new User("Alice Johnson"));

            // Tüm kullanıcıları alıp ekrana yazdırma
            System.out.println("Tüm Kullanıcılar:");
            userDao.list().forEach(System.out::println);

            // Bir kullanıcıyı silme
            userDao.delete(2);

            // Silindikten sonra kalan kullanıcıları tekrar yazdırma
            System.out.println("\nKullanıcı Silindikten Sonra:");
            userDao.list().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public interface UserDao {
        @SqlUpdate("CREATE TABLE IF NOT EXISTS ad_soyad (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255))")
        void createTable();

        @SqlUpdate("INSERT INTO ad_soyad (name) VALUES (:name)")
        void insert(User user);

        @SqlQuery("SELECT * FROM ad_soyad")
        List<User> list();

        @SqlUpdate("DELETE FROM ad_soyad WHERE id = :id")
        void delete(int id);
    }

    public class User {
        private int id;
        private String name;

        public User() {}

        public User(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
