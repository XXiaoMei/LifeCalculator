
package com.example.android.wizardpager.wizard.model;

import java.util.ArrayList;


public interface PageTreeNode {
    public Page findByKey(String key);
    public void flattenCurrentPageSequence(ArrayList<Page> dest);
}
