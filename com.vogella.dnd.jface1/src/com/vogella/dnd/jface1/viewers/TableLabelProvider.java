package com.vogella.dnd.jface1.viewers;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.vogella.dnd.jface1.model.Todo;

public class TableLabelProvider extends BaseLabelProvider implements
        ITableLabelProvider {

    @Override
    public Image getColumnImage(Object element, int columnIndex) {
        return null;
    }

    @Override
    public String getColumnText(Object element, int columnIndex) {
        Todo todo = (Todo) element;
        switch (columnIndex) {
        case 0:
            return todo.getShortDescription();
        case 1:
            return todo.getLongDescription();
        }
        return "Not supported";
    }

}