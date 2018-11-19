package re.itpark;

public class SportMasterBonusService {
    public int calculateBonus(int accumulatedPurchaseAmount, int purchaseAmount, int currentBonusAmounnt) {
        int lowerBorderBlueCard = 1;
        int upperBorderBlueCard = 15_000;
        int lowerBorderSilverCard = 15_001;
        int upperBorderSilverCard = 150_000;
        int fullRate = 1_000;
        int bonusBlueCard = 50;
        int bunusSilverCard = 70;
        int bonusGoldCard = 100;
        int bonusMultiplier;

        if (accumulatedPurchaseAmount >= lowerBorderBlueCard && accumulatedPurchaseAmount <= upperBorderBlueCard) {
            bonusMultiplier = purchaseAmount / fullRate;
            currentBonusAmounnt = currentBonusAmounnt + bonusBlueCard * bonusMultiplier;
        } else if (accumulatedPurchaseAmount >= lowerBorderSilverCard && accumulatedPurchaseAmount <= upperBorderSilverCard) {
            bonusMultiplier = purchaseAmount / fullRate;
            currentBonusAmounnt = currentBonusAmounnt + bunusSilverCard * bonusMultiplier;
        } else {
            bonusMultiplier = purchaseAmount / fullRate;
            currentBonusAmounnt = currentBonusAmounnt + bonusGoldCard * bonusMultiplier;
        }
        return currentBonusAmounnt;
    }
}
