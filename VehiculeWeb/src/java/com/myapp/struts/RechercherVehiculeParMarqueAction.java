/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author khemp
 */
public class RechercherVehiculeParMarqueAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";


    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        // extract user data
        RechercherVehiculeParMarque formBean = (RechercherVehiculeParMarque) form;
        String saisie = formBean.getSaisie();
        request.setAttribute("saisie", saisie);
        // perform validation
        if (saisie == null) {//la saisie est null
            return mapping.findForward(FAILURE);
        }else{
            return mapping.findForward(SUCCESS);
        }
    }
}
