package ru.itpark;

public class SportMasterBonusService {
    public int calculateBonus(int accumulatedPurchaseAmount, int purchaseAmount, int currentBonusAmount) {
        int lowerBorderBlueCard = 1;
        int upperBorderBlueCard = 15_000;
        int lowerBorderSilverCard = 15_001;
        int upperBorderSilverCard = 150_000;
        int fullRate = 1_000;
        int bonusBlueCard = 50;
        int bonusSilverCard = 70;
        int bonusGoldCard = 100;
        purchaseAmount += accumulatedPurchaseAmount;
        int bonusMultiplier = purchaseAmount / fullRate;
        if (purchaseAmount >= lowerBorderBlueCard && purchaseAmount <= upperBorderBlueCard) {
            currentBonusAmount += bonusBlueCard * bonusMultiplier;
        } else if (purchaseAmount >= lowerBorderSilverCard && purchaseAmount <= upperBorderSilverCard) {
            currentBonusAmount += bonusSilverCard * bonusMultiplier;
        } else currentBonusAmount += bonusGoldCard * bonusMultiplier;
        return currentBonusAmount;
    }
}
