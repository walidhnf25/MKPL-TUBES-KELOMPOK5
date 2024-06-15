/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import com.mycompany.restoran.BahanBaku;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author haida
 */
public class BahanBakuTest {

    @Test
    public void testGettersAndSetters() {
        // Arrange
        BahanBaku bahanBaku = new BahanBaku("Tepung", 5000);

        // Act and Assert
        assertEquals("Tepung", bahanBaku.getNamaBahan());
        assertEquals(5000, bahanBaku.getHarga());

        // Act
        bahanBaku.setNamaBahan("Gula");
        bahanBaku.setHarga(8000);

        // Assert
        assertEquals("Gula", bahanBaku.getNamaBahan());
        assertEquals(8000, bahanBaku.getHarga());
    }
} // public void hello() {}
