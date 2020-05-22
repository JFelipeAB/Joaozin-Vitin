/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.thread.messages;

import business.auditoria.SistemaAuditoria;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class ThreadMessages extends Thread {
    private boolean status;

    @Override
    public void run() {
        setStatus(true);
        while (status) {
            try {
                String message = SistemaAuditoria.getIstance().getMessage();
                if (message != null) {
                    sendMessage(message);
                }
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadMessages.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void setStatus(boolean value) {
        status = value;
    }

    private void sendMessage(String message) throws InterruptedException {
        System.out.printf(message);
        Thread.sleep(100);
    }
}
