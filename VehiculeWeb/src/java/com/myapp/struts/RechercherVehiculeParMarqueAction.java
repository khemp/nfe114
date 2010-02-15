package com.myapp.struts;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nfe114_gestion_parc_automobile.Vehicule;
import nfe114_gestion_parc_automobile.VehiculeFactory;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
/**
 *
 * @author khemp
 */

public class RechercherVehiculeParMarqueAction extends Action {

    /* forward name="success" path="" */
    private final static String SUCCESS = "sucess";
    private final static String EMPTY = "empty";

    public ActionForward execute(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RechercherVehiculeParMarque myform = (RechercherVehiculeParMarque) form;
        String marque = myform.getSaisie();
        List<Vehicule> vehicules = VehiculeFactory.rechercherVehiculeParMarque(marque);
        if(vehicules == null || vehicules.size() ==0) {
            return mapping.findForward(SUCCESS);
        }

        request.setAttribute("vehicules", vehicules);
        return mapping.findForward(SUCCESS);
        //VehiculeFactory.NouveauVehicule("citroen", "saxo",55000,"gris");

    }
}
