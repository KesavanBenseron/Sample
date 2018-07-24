package com.example.kesavant.kiosk.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kesavanT on 12/6/2017.
 */

public class MenuModifier {
    //@SerializedName("modifierId")
    public String id;
    //@SerializedName("modifierName")
    public String name;
    //@SerializedName("type")
    public String type;
    //@SerializedName("modifierGroupId")
    public String modGrpid;
    // it will use after the item place other wise it will default int value
    public int placeOrderNo;
    public String prefixid;
    public String modifierNo = "";
}
