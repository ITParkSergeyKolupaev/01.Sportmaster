package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportMasterBonusServiceTest {

    @Test
    void calculateBonus() {
        {
            SportMasterBonusService sportMasterBonusService = new SportMasterBonusService();
            int calculateBonus = sportMasterBonusService.calculateBonus(10_000, 6300, 200);
            assertEquals(500, calculateBonus);
        }
        {
            SportMasterBonusService sportMasterBonusService = new SportMasterBonusService();
            int calculateBonus = sportMasterBonusService.calculateBonus(25_000, 30_000, 600);
            assertEquals(2_700, calculateBonus);
        }
        {
            SportMasterBonusService sportMasterBonusService = new SportMasterBonusService();
            int calculateBonus = sportMasterBonusService.calculateBonus(151_000, 80_000, 1_000);
            assertEquals(9_000, calculateBonus);
        }
    }
}