/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class TestStreaming {
    
//    @Test
    public void test() {
        Persistence.createEntityManagerFactory("PU").createEntityManager();
    }
    @Test
    public void jpaInitialisation()
    {
    Persistence.createEntityManagerFactory("StreamingPU");
    }
}
