/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.bean.session;

import remote.bean.entity.Account;

/**
 *
 * @author Luong
 */
public interface AccountBeanRemote {
       public Account getAccountByID(int id);
}
