package com.Dept;

/**
 * Created by Aniket on 7/29/2017.
 */
public class Department {
    int deptId;
    int deptEmpCount;
    String deptName;

    public Department(int deptId, int deptEmpCount, String deptName) {
        this.deptId = deptId;
        this.deptEmpCount = deptEmpCount;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getDeptEmpCount() {
        return deptEmpCount;
    }

    public void setDeptEmpCount(int deptEmpCount) {
        this.deptEmpCount = deptEmpCount;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Department {");
        sb.append("deptId=").append(deptId);
        sb.append(", deptEmpCount=").append(deptEmpCount);
        sb.append(", deptName='").append(deptName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
