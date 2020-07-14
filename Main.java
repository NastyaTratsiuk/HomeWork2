package com.itacademy;

public class Main {
    public static void main(String[] args) {

        Telephone nokia = new Telephone();
        nokia.displeyInfo();
        nokia.photo();
        System.out.println();

        Telephone samsung = new Telephone("samsung",5, 4);
        samsung.displeyInfo();
        System.out.println("Customer Rating"+ samsung.getCustomerRating());
        System.out.println("RAM "+ samsung.getRAM());
        samsung.photo();
        System.out.println();

        Telephone lg = new Telephone("lg",true, 140.6f, 2019, 64, 3200, 195, 1499.99,10);
        lg.setCustomerRating(5);
        lg.setRAM(10);
        lg.displeyInfo();
        System.out.println("Customer Rating " +lg.getCustomerRating());
        System.out.println("RAM " +lg.getRAM());
        lg.photo();

        System.out.println(lg.colculateTelephoneAndCaseSummaryWeight(lg.weightCase));
        System.out.println(nokia.colculateFlashMemoryAndMemoryCard(nokia.memoryCard));
        System.out.println(samsung.colculateThicknessTelephoneAndThicknessWirelessChargingModule(samsung.thickessWirelessChargingModule));
        System.out.println(lg.colculatePhonePriseInYear(lg.oldModelPriceReductionFactor));
        System.out.println(nokia.colculationBatteryPowerInAYear(nokia.batteryReductionRatePerYear));
        nokia.payOfPhone(lg.nfc);
        lg.phonePaymentMethod(lg.nfc);
        nokia.cameraRating(nokia.cameraPixels);
        lg.customerReviews(lg.getCustomerRating());
        lg.customerReviewsSwitch(lg.getCustomerRating());
        nokia.averageBatteryLife(nokia.batteryCapacity);
        lg.phoneRAMComparison(lg.getRAM());
        lg.phoneRAWComparisonSwitch(lg.getRAM());

    }
}
