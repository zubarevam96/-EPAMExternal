package com.zubarevam.test;

import com.zubarevam.classes.forindoors.Lamp;
import com.zubarevam.classes.forkitchen.Fridge;
import com.zubarevam.classes.forkitchen.SlowCooker;
import com.zubarevam.classes.forrestroom.Computer;
import com.zubarevam.classes.forrestroom.Torchere;
import com.zubarevam.classes.multienviromental.Laptop;
import com.zubarevam.classes.multienviromental.Telephone;
import com.zubarevam.enums.Place;
import com.zubarevam.interfaces.ElectricalAppliance;
import com.zubarevam.logic.FindAppliance;
import com.zubarevam.logic.SortByElectricityConsumption;

public class TestArray {
    public static final int N = 10; // количество приборов
    private ElectricalAppliance[] arr;
    public TestArray() {
        arr = new ElectricalAppliance[10];
        arr[0] = new Lamp("LampModel_1", 45, Place.OUTDOORS, false);
        arr[1] = new Lamp("LampModel_2", 60, Place.HALLWAY);
        arr[2] = new Lamp("LampModel_3", 45, Place.RESTROOM, true);
        arr[3] = new Computer("ComputerModel_1", 550, Place.KITCHEN);
        arr[4] = new Fridge("FrigeModel", 250);
        arr[5] = new SlowCooker("SlowCookerModel", 860);
        arr[6] = new Computer("ComputerModel_2", 575);
        arr[7] = new Torchere("TorchereModel", 50);
        arr[8] = new Laptop("LaptopModel", 400, Place.RESTROOM);
        arr[9] = new Telephone("TelephoneModel", 200, Place.OUTDOORS);

        arr[1].plugIn();
        arr[2].plugIn();
        arr[5].plugIn();
        arr[6].plugIn();
        arr[8].plugIn();
    }

    public ElectricalAppliance[] getArray() {
        return arr;
    }

    public ElectricalAppliance[] testSorting() {
        SortByElectricityConsumption.quickSort(arr);
        return arr;
    }
    public ElectricalAppliance[] testFinding(int min, int max) {
        return FindAppliance.byPowerConsumption(arr, min, max);
    }

}
