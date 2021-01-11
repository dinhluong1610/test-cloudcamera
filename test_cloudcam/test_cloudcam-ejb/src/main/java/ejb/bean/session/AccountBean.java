/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.bean.session;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import remote.bean.entity.Account;
import remote.bean.session.AccountBeanRemote;

/**
 *
 * @author Luong
 */
@Stateless
public class AccountBean implements AccountBeanRemote {
    @PersistenceContext(name = "test_test_cloudcam-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    protected EntityManager getEntityManager(){
        return em;
    }
    public Account getAccountByID(int id){
        TypedQuery<Account> typedQuery=getEntityManager().createNamedQuery("Account.findById",Account.class);
        typedQuery.setParameter("id", id);
        try {
            return typedQuery.getSingleResult();
        } catch (Exception e) {
            return null;
        }
        
        
    }
    
}