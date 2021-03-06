package com.sec.ax.restful.pojo;

/**
 *
 * @author heesik.jeon
 *
 */

public class RoleTypeHandlerCallback extends AbstractTypeHandlerCallback {

    /* 
     * @see com.sec.restful.pojo.AbstractTypeHandlerCallback#valueOf(java.lang.String)
     */
    @Override
    public Object valueOf(String paramString) {

        Role role = Role.valueOf(paramString);
        
        if (role == null) {
            throw new RuntimeException("Unexpected value found: " + paramString);
        }
        
        return role;

    }

}
