package com.branch;

/**
 * Created by Aniket on 7/27/2017.
 */
public class Branch {
    int branchId;
    String branchCity;
    int branchWorth;

    public Branch(int branchId, String branchCity, int branchWorth) {
        this.branchId = branchId;
        this.branchCity = branchCity;
        this.branchWorth = branchWorth;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchCity() {
        return branchCity;
    }

    public void setBranchCity(String branchCity) {
        this.branchCity = branchCity;
    }

    public int getBranchWorth() {
        return branchWorth;
    }

    public void setBranchWorth(int branchWorth) {
        this.branchWorth = branchWorth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Branch {");
        sb.append("branchId=").append(branchId);
        sb.append(", branchCity='").append(branchCity).append('\'');
        sb.append(", branchWorth=").append(branchWorth);
        sb.append('}');
        return sb.toString();
    }
}
