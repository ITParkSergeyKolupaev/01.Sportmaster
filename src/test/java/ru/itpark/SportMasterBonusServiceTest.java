package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportMasterBonusServiceTest {

    @Test
    @DisplayName("Calculate bonus Sportmaster")
    void calculateBonus() {
        {
            SportMasterBonusService sportMasterBonusService = new SportMasterBonusService();
            int calculateBonus = sportMasterBonusService.calculateBonus(10_000, 6300, 200);
            assertEquals(1_320, calculateBonus);
        }
        {
            SportMasterBonusService sportMasterBonusService = new SportMasterBonusService();
            int calculateBonus = sportMasterBonusService.calculateBonus(25_000, 30_000, 600);
            assertEquals(4_450, calculateBonus);
        }
        {
            SportMasterBonusService sportMasterBonusService = new SportMasterBonusService();
            int calculateBonus = sportMasterBonusService.calculateBonus(151_000, 80_000, 1_000);
            assertEquals(24_100, calculateBonus);
        }
        {
            SportMasterBonusService sportMasterBonusService = new SportMasterBonusService();
            int   calculateBonus = sportMasterBonusService.calculateBonus(0, 1_000, 0);
            assertEquals(50, calculateBonus);
        }
    }
}