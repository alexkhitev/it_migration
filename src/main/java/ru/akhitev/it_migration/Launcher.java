/*
 * ru.akhitev.it_migration is an JavaFX application for automatically it infrastructure migration from Windows to Linux, with it's all services.
 * Copyright (c) 2014 Aleksei Khitevi (Хитёв Алексей Юрьевич).
 *
 * This file is part of ru.akhitev.it_migration
 *
 * ru.akhitev.it_migration is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * ru.akhitev.it_migration is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
*/

package ru.akhitev.it_migration;

import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

    public static void main( String[] args )
    {
        Application.launch(Launcher.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Configurator.loadClassesFromSpring();
        Parent root = FXMLLoader.load(
                (new File(Configurator.getFXMLS_PATH())).toURI().toURL(),
                Configurator.getLocalizator().getLocalizationResource());
        Scene scene = new Scene(root, 800, 650);
        primaryStage.setTitle("IT_migraion");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
