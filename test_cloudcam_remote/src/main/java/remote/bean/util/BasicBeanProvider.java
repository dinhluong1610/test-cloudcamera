/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote.bean.util;

import com.cunglam.util.remote.provider.AbstractBeanProvider;
import java.util.Properties;
import javax.naming.Context;
import remote.bean.session.AccountBeanRemote;



/**
 *
 * @author vtc media
 */
public class BasicBeanProvider extends AbstractBeanProvider {

    public static BasicBeanProvider getInstance() {
        return BeanProviderHolder.INSTANCE;
    }

    private BasicBeanProvider() {

    }

    @Override
    protected Properties getEnvironment() {
//        Khai báo kết nối jboss
        Properties jndiProperties = new Properties();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        return jndiProperties;
    }

    public static AccountBeanRemote getAccountBean() {
        return getInstance().getBean(Jndi.ACCOUNT_BEAN_REMOTE);
    }

     
    private static class BeanProviderHolder {

        private static final BasicBeanProvider INSTANCE = new BasicBeanProvider();

        private BeanProviderHolder() {
        }
    }
}
