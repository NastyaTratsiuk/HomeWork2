package com.itacademy;

public class Telephone {
    public String brand;
    public boolean nfc;
    public float thickness;
    public int weight;
    public int year;
    public int cameraPixels;
    public int fleshMemory;
    public int batteryCapacity;
    public double price;
    private int customerRating;
    private int ram;
    int weightCase = 20;
    int memoryCard = 64;
    float thickessWirelessChargingModule = 1.6f;
    double oldModelPriceReductionFactor = 0.15;
    double batteryReductionRatePerYear = 0.20;

    public void photo() {
        System.out.println("I am beautiful!");
    }

    public void displeyInfo() {
        System.out.println("Brand " + brand);
        System.out.println("NFC " + nfc);
        System.out.println("Lenght " + thickness);
        System.out.println("Year " + year);
        System.out.printf("FleshMemory" + fleshMemory);
        System.out.println("Battery capacity" + batteryCapacity);
        System.out.println("Weight" + weight);
        System.out.println("Price" + price);
        System.out.println("Camera pixels" + cameraPixels);
    }

    public Telephone() {
        brand = "Nokia";
        nfc = false;
        thickness = 157.8f;
        year = 2018;
        fleshMemory = 64;
        batteryCapacity = 2800;
        weight = 204;
        price = 1080;
        cameraPixels = 18;
    }
    public Telephone(String brand, int customerRating, int ram) {
        this.brand = brand;
        nfc = true;
        thickness = 160.5f;
        year = 2019;
        fleshMemory = 128;
        batteryCapacity = 2900;
        weight = 200;
        price = 1150;
        cameraPixels = 12;
        this.customerRating = customerRating;
        this.ram = ram;
    }
    public Telephone(String brand, boolean nfc, float thickness, int year, int fleshMemory, int batteryCapacity, int weight, double price, int cameraPixels) {
        this.brand = brand;
        this.nfc = nfc;
        this.thickness = thickness;
        this.year = year;
        this.fleshMemory = fleshMemory;
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
        this.price = price;
        this.cameraPixels = cameraPixels;
        this.customerRating = customerRating;
    }
    public int getCustomerRating() {
        return customerRating;
    }
    public void setCustomerRating(int customerRating) {
        this.customerRating = customerRating;
    }
    public int getRAM() {
        return ram;
    }
    public void setRAM(int ram) {
        this.ram = ram;
    }
    public int colculateTelephoneAndCaseSummaryWeight(int weightCase) {
        int weightTelefphoneAndCase = weight + weightCase;
        return weightTelefphoneAndCase;
    }
    public int colculateFlashMemoryAndMemoryCard(int memoryCard) {
        int sumFleshMemoryAndMemoryCard = fleshMemory + memoryCard;
        return sumFleshMemoryAndMemoryCard;
    }
    public float colculateThicknessTelephoneAndThicknessWirelessChargingModule(float thickessWirelessChargingModule) {
        float sumThicknessTelephoneAndWirelessCharningModule = thickness + thickessWirelessChargingModule;
        return sumThicknessTelephoneAndWirelessCharningModule;
    }
    public double colculatePhonePriseInYear(double oldModelPriceReductionFactor) {
        double priceTeleploneInAYear = price - (price * oldModelPriceReductionFactor);
        return priceTeleploneInAYear;
    }
    public double colculationBatteryPowerInAYear(double batteryReductionRatePerYear) {
        double batteryCapacityInAYear = batteryCapacity - (batteryCapacity * batteryReductionRatePerYear);
        return batteryCapacityInAYear;
    }
    public void payOfPhone(boolean nfc) {
        String payOfPhone = (nfc == true) ? "Вы можете оплатить телефоном" : "Вы не можете оплатить телефоном";
        System.out.println(payOfPhone);
    }
    public void phonePaymentMethod(boolean nfc) {
        String phonePaymentMethod = (nfc == false) ? "Вы не можете оплатить телефоном" : (nfc == true) ? "Вы можете оплатить отпечатком пальца" :
                "Вы можете оплатить Fase ID";
        System.out.println(phonePaymentMethod);
    }
    public void cameraRating(int cameraPixels) {
        if (cameraPixels <= 8) {
            System.out.println("Камера плохая.");
        } else if (cameraPixels > 8 && cameraPixels <= 13) {
            System.out.println("Камера нормальная.");
        } else if (cameraPixels > 13 && cameraPixels <= 16) {
            System.out.println("Камера хорошая.");
        } else {
            System.out.println("Камера отличная.");
        }
    }
    public void customerReviews(int getCustomerRating) {
        if (getCustomerRating == 5) {
            System.out.println("Покупатель полностью доволен телефоном!");
        } else if (getCustomerRating == 4) {
            System.out.println("Покупатель доволен телефоном!");
        } else if (getCustomerRating == 3) {
            System.out.println("Покупателю что-то не понравилось в телефоне.");
        } else if (getCustomerRating == 2) {
            System.out.println("Покупателю не понравился телефон.");
        } else if (getCustomerRating == 1) {
            System.out.println("Покупатель полностью разочаровался в телефоне.");
        } else {
            System.out.println("Такой оценки не существует.");
        }
    }
    public void customerReviewsSwitch(int getCustomerRating) {
        switch (getCustomerRating) {
            case 1:
                System.out.println("Покупатель полностью разочаровался в телефоне.");
                break;
            case 2:
                System.out.println("Покупателю не понравился телефон.");
                break;
            case 3:
                System.out.println("Покупателю что-то не понравилось в телефоне.");
                break;
            case 4:
                System.out.println("Покупатель доволен телефоном!");
                break;
            case 5:
                System.out.println("Покупатель полностью доволен телефоном!");
                break;
            default:
                System.out.println("Такой оценки не существует.");
                break;
        }
    }
    public void averageBatteryLife(int batteryCapacity) {
        if (batteryCapacity <= 2000) {
            System.out.println("Заряда батареи не хватит на световой день.");
        } else if (batteryCapacity > 2000 && batteryCapacity <= 3000) {
            System.out.println("Заряда батареи хватит на световой день.");
        } else {
            System.out.println("Заряда батареи хватит на один - два дня");
        }
    }
    public void phoneRAMComparison(int getRAM) {
        if (getRAM < 3) {
            System.out.println("Мало RAW.");
        } else if (getRAM == 3 || getRAM == 4) {
            System.out.println("Достаточно RAW для большинства пользователей.");
        } else if (getRAM == 6 || getRAM == 8) {
            System.out.println("RAW, которая пригодится особенно требовательным пользователям.");
        } else if (getRAM == 10 || getRAM == 12) {
            System.out.println("Много RAW , лишнее потребление энергии.");
        }else {
            System.out.println("Такой RAW не существует.");
        }

    }
    public void phoneRAWComparisonSwitch(int getRAM) {
        switch (getRAM){
            case 1:
            case 2:
                System.out.println("Мало RAW.");
                break;
            case 3:
            case 4:
                System.out.println("Достаточно RAW для большинства пользователей.");
                break;
            case 6:
            case 8:
                System.out.println("RAW, которая пригодится особенно требовательным пользователям.");
                break;
            case 10:
            case 12:
                System.out.println("Много RAW , лишнее потребление энергии.");
                break;
            default:
                System.out.println("Такой RAW не существует.");
                break;
        }
    }
}