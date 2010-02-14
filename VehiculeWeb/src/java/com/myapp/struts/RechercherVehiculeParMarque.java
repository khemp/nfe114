/*
 * RechercheVehiculeParMarque.java
 *
 * Created on 16 mars 2007, 21:19
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author jfd-perso
 * @version
 */

public class RechercherVehiculeParMarque extends org.apache.struts.action.ActionForm {

    private String saisie;

    /**
     * @return
     */
    public String getSaisie() {
        return saisie;
    }

    /**
     * @param string
     */
    public void setSaisie(String saisie) {
        this.saisie = saisie;
    }

    /**
     *
     */
    public RechercherVehiculeParMarque() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getSaisie() == null || getSaisie().length() < 1) {
            errors.add("saisie", new ActionMessage("error.saisie.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
