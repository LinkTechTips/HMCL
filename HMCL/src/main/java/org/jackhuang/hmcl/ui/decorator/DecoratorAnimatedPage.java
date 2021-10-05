/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2020  huangyuhui <huanghongxun2008@126.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.jackhuang.hmcl.ui.decorator;

import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Skin;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class DecoratorAnimatedPage extends Control {

    private final VBox left = new VBox();
    private final StackPane center = new StackPane();

    protected void setLeft(Node... children) {
        left.getChildren().setAll(children);
    }

    protected void setCenter(Node... children) {
        center.getChildren().setAll(children);
    }

    @Override
    protected Skin<?> createDefaultSkin() {
        return new DecoratorAnimatedPageSkin(this);
    }

    private static class DecoratorAnimatedPageSkin extends SkinBase<DecoratorAnimatedPage> {

        protected DecoratorAnimatedPageSkin(DecoratorAnimatedPage control) {
            super(control);

            BorderPane pane = new BorderPane();
            pane.setLeft(control.left);
            pane.setCenter(control.center);
            getChildren().setAll(pane);
        }
    }

}