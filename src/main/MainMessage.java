/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewMessage;
import models.ModelMessage;
import controllers.ControllerMessage;

/**
 *
 * @author colegio luis ponce
 */
public class MainMessage{
     private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage controllerMessage;

    public static void main(String[] pao) {
        viewMessage = new ViewMessage();
        modelMessage = new ModelMessage();
        controllerMessage = new ControllerMessage(viewMessage, modelMessage);
    }
}
