/*
 * Copyright © 2024. XTREME SOFTWARE SOLUTIONS
 *
 * All rights reserved. Unauthorized use, reproduction, or distribution
 * of this software or any portion of it is strictly prohibited and may
 * result in severe civil and criminal penalties. This code is the sole
 * proprietary of XTREME SOFTWARE SOLUTIONS.
 *
 * Commercialization, redistribution, and use without explicit permission
 * from XTREME SOFTWARE SOLUTIONS, are expressly forbidden.
 */

package com.xss.it.nfx.list.skin;


import com.xss.it.nfx.list.internals.BaseListView;
import javafx.scene.control.SkinBase;
import xss.it.nfx.list.NfxListView;


/**
 * @author XDSSWAR
 * Created on 06/28/2024
 */
public class NfxListViewSkin<T> extends SkinBase<NfxListView<T>> {
    /**
     * The style class for the NfxListViewSkin.
     */
    private static final String STYLE_CLASS = "nfx-base";

    /**
     * The delegate BaseListView.
     */
    private final BaseListView<T> delegate;

    /**
     * Constructs an NfxListViewSkin.
     * @param listView the NfxListView to be skinned
     * @param delegate the delegate BaseListView
     */
    public NfxListViewSkin(NfxListView<T> listView, BaseListView<T> delegate) {
        super(listView);
        this.delegate = delegate;

        initialize();
    }

    /**
     * Initializes the skin.
     * Adds the style class and the delegate to the children.
     */
    private void initialize() {
        getSkinnable().getStyleClass().add(STYLE_CLASS);
        getChildren().add(delegate);
        getSkinnable().setPrefSize(200, 200);
    }

}
