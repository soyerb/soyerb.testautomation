package org.example;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTest {

    @Test(dataProvider = "maasBilgileri")
    public void testToplamMaasHesapla(int calismaGunu, double gunlukMaas, double expectedToplamMaas) {
        double actualToplamMaas = Main.calculateTotalSalary(calismaGunu, gunlukMaas);
        Assert.assertEquals(actualToplamMaas, expectedToplamMaas);
    }

    @DataProvider(name = "maasBilgileri")
    public Iterator<Object[]> maasBilgileriDataProvider() {
        List<Object[]> testCases = new ArrayList<>();

        // Test vakalarını burada tanımlayın
        testCases.add(new Object[]{20, 100, 2000.0}); // Normal durum
        testCases.add(new Object[]{30, 100, 3500.0}); // 25'ten fazla çalışma günü

        return testCases.iterator();
    }
}
