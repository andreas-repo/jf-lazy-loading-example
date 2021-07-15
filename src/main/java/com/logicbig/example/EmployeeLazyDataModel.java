package com.logicbig.example;

import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

import java.util.List;
import java.util.Map;

public class EmployeeLazyDataModel extends LazyDataModel<Employee> {

    public EmployeeLazyDataModel(){
        System.out.println("--------- "+this+" -----------------");
        this.setRowCount(DataService.INSTANCE.getEmployeeTotalCount());
    }

    @Override
    public List<Employee> load(int first, int pageSize, Map<String, SortMeta> map, Map<String, FilterMeta> map1) {
        List<Employee> list = DataService.INSTANCE.getEmployeeList(first, pageSize);
        return list;
    }
}