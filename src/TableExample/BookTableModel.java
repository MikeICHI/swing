package TableExample;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class BookTableModel extends AbstractTableModel {

    private String title;
    private String author;
    private String yearOfPublication;
    private String ISBN;

    private int columnCount = 4;
    private ArrayList<String[]> dataArrayList;

    public BookTableModel(){
        dataArrayList = new ArrayList<>();
        for (int i = 0; i < dataArrayList.size(); i++) {
            dataArrayList.add(new String[getColumnCount()]);
        }
    }

    @Override
    public int getRowCount() {
        return dataArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] rows = dataArrayList.get(rowIndex);

        return rows[columnIndex];
    }

    public String getColumnName(int columnIndex){
        switch (columnIndex){
            case 0: return "title";
            case 1: return "ISBN";
            case 2: return "author";
            case 3: return "yearOfPublication";
        }
        return null;
    }


    public void addData(String []row){
        dataArrayList.add(row);
    }

}
