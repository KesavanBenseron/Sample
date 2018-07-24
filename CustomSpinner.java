package com.example.kesavant.kiosk.Model;

/**
 * Created by kesavanT on 1/3/2018.
 */

public class CustomSpinner {
    private String prefixid;
    private String prefixname;
    private String modid;
    private String modgrpid;

    public CustomSpinner() {
    }

    public CustomSpinner(String id, String name) {
        this.prefixid = id;
        this.prefixname = name;
    }

    public String getprefixId() {
        return prefixid;
    }

    public void setprefixId(String prefixid) {
        this.prefixid = prefixid;
    }

    public String getprefixName() {
        return prefixname;
    }

    public void setprefixName(String prefixname) {
        this.prefixname = prefixname;
    }

    public String getModid() {
        return modid;
    }

    public void setModid(String modid) {
        this.modid = modid;
    }

    public String getModgrpid() {
        return modgrpid;
    }

    public void setModgrpid(String modgrpid) {
        this.modgrpid = modgrpid;
    }

    @Override
    public String toString() {
        return prefixname;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CustomSpinner){
            CustomSpinner c = (CustomSpinner )obj;
            if(c.getprefixName().equals(prefixname) && c.getprefixId()==prefixid && c.getModid() == modid && c.getModgrpid() == modgrpid) return true;
        }

        return false;
    }
}
