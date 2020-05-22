/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.auditoria;

import business.thread.messages.ThreadMessages;
import java.util.LinkedList;

/**
 *
 * @author Dell
 */
public class SistemaAuditoria {
    private static SistemaAuditoria istance;
    LinkedList<String> messages;
    ThreadMessages thread;
    
    private SistemaAuditoria() {
        messages = new LinkedList<>();
    }

    public static SistemaAuditoria getIstance() {
        if (istance == null) {
            istance = new SistemaAuditoria();
        }
        return istance;
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    public String getMessage() {
        String message = messages.poll();
        return message;
    }
    
    public void activate(){
        if (thread == null){
            thread = new ThreadMessages();
            thread.start();
        }
    }
    
    public void desactivate() throws InterruptedException{
        if (thread != null) {
            thread.setStatus(false);
            thread.join(2000);
            if (thread.isAlive())
                thread.interrupt();
        }
    }
}
