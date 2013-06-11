/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.html;

import com.unrc.app.models.*;
import java.util.List;
import org.javalite.activejdbc.Model;

/**
 *
 * @author lprone
 */
public class HTML {

    
    /**
     *
     * @return html code of index page
     */
    public static String index() {
        return "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Revista Inmobiliaria</title>\n"
                + "<style type=\"text/css\">\n"
                + ".Estilo1 {font-family: \"comic Sans MS\"}\n"
                + "</style>\n"
                + "</head>\n"
                + "\n"
                + "<body style=\"background-color:#eeeeee;\">\n"
                +"<h1 align=\"center\"><font face=\"comic Sans MS\"><strong><font  size=\"12\" face=\"comic Sans MS\" color=\"red\">E</font>l <font size=\"12\" face=\"comic Sans MS\" color=\"red\">I</font>nmonbiliario</span></strong></font></h1>\n"
                +"</br>\n"
                +"</br>\n"
                + "<h1 align=\"center\"><strong><a href=\"/search\" style=\"text-decoration:none\" ><font color=\"red\">Buscar Inmueble</font></a></span></strong></h1>\n"
                + "<h2 align=\"left\"><strong><a href=\"/saveCity\" style=\"text-decoration:none\" ><font face=\"comic Sans MS\">Insertar Ciudad</font></a></strong></h1>\n"
                + "<h2 align=\"left\"><strong><a href=\"/saveDistrict\" style=\"text-decoration:none\" ><font face=\"comic Sans MS\">Insertar Distrito</font></a></strong></h1>\n"
                + "<h2 align=\"left\"><strong><a href=\"/saveOwner\" style=\"text-decoration:none\" ><font face=\"comic Sans MS\">Insertar Duenio</font></a></strong></h1>\n"
                + "<h2 align=\"left\"><strong> <a href=\"/saveBuilding\" style=\"text-decoration:none\" ><font face=\"comic Sans MS\">Insertar Inmueble</font></a></strong></h1>\n"
                + "<h2 align=\"left\"><strong> <a href=\"/saveRealState\" style=\"text-decoration:none\" ><font face=\"comic Sans MS\">Insertar Inmobiliaria</font></a></strong></h1>\n"
                + "<h2 align=\"left\"><strong> <a href=\"/cityList\" style=\"text-decoration:none\" ><font face=\"comic Sans MS\">Ver Ciudades</font></a></strong></h1>\n"
                + "<h2 align=\"left\"><strong> <a href=\"/districtList\" style=\"text-decoration:none\" ><font face=\"comic Sans MS\">Ver Distritos</font></a></strong></h1>\n"
                + "<h2 align=\"left\"><strong> <a href=\"/ownersList\" style=\"text-decoration:none\" ><font face=\"comic Sans MS\">Ver Duenios</font></a></strong></h1>\n"
                + "<h2 align=\"left\"><strong> <a href=\"/buildingsList\" style=\"text-decoration:none\" ><font face=\"comic Sans MS\">Ver Inmuebles</font></a></strong></h1>\n"
                + "<h2  align=\"left\"><strong> <a href=\"/realStateList\" style=\"text-decoration:none\" ><font face=\"comic Sans MS\">Ver Inmobiliarias</font></a></strong></h1>\n"
                + "</body>\n"
                + "</html>";
    }

    /**
     *
     * @param l list with elements to show
     * @return html code for show elements in list
     */
    public static String show(List l) {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Listar</title>\n"
                + "</head>\n"
                + "<body>\n";
        for (Object o : l) {
            ret += "<p>" + o.toString() + "</p>\n";
        }

        ret += "</body>\n"
                + "</html>";
        return ret;

    }

    /**
     *
     * @param l list with values to set in combo row
     * @param id name of id column
     * @param value name of value column
     * @return html code for set values in fields of comboLists
     */
    private static String setFields(List l, String id, String value) {
        String ret = "";
        for (Object c : l) {
            ret += "<option value=\"" + ((Model) c).getString(id) + "\">" + ((Model) c).getString(value) + "</option>";
        }
        return ret;
    }

    /**
     *
     * @return html code for save a new city
     */
    public static String saveCity() {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<!-- TemplateBeginEditable name=\"doctitle\" -->\n"
                + "<title>Guardar Ciudad</title>\n"
                + "<!-- TemplateEndEditable -->\n"
                + "<!-- TemplateBeginEditable name=\"head\" -->\n"
                + "<!-- TemplateEndEditable -->\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n"
                + "  <label>\n"
                + "  <div align=\"center\">\n"
                + "  Nombre\n"
                + "  <input name=\"name\" type=\"text\" id=\"name\" />\n"
                + "  <br />\n"
                + "  <br />\n"
                + "  <input type=\"submit\" name=\"Submit\" value=\"Enviar\" />\n"
                + "  </div>\n"
                + "  </label>\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>";
        return ret;
    }
    
    /**
     *
     * @return html code for save a new district
     */
    public static String saveDistrict(List<City> cities) {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<!-- TemplateBeginEditable name=\"doctitle\" -->\n"
                + "<title>Guardar Distrito</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n"
                + "  <label>\n"
                + "     <div align=\"left\"> Nombre\n"
                + "     <input name=\"name\" type=\"text\" id=\"name\" />\n"
                + "     </div>\n"
                +"   </label>\n"
                + "  <p align=\"left\">\n"
                + "    <label>Ciudad \n"
                + "    <select name=\"city_id\" id=\"city_id\">\n";
        ret     += setFields(cities, "id", "name");
        ret     += "    </select>\n"
                + "    </label>\n"
                + "  <br />\n"
                + "  <br />\n"
                + "  <input type=\"submit\" name=\"Submit\" value=\"Enviar\" />\n"
                + "  </div>\n"
                + "  </label>\n"
                + "  </p>\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>";
        return ret;
    }


    /**
     *
     * @return html code for save a new owner
     */
    public static String saveOwner(List<City> cities, List<District> districts) {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Cargar Duenio</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n"
                + "  <label>\n"
                + "  <div align=\"center\">Nombre\n"
                + "    <input name=\"name\" type=\"text\" id=\"name\" />\n"
                + "  </div>\n"
                + "  </label>\n"
                + "  <p align=\"center\">Calle\n"
                + "    <label> &nbsp &nbsp \n"
                + "      <input name=\"street\" type=\"text\" id=\"street\" />\n"
                + "      </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>Numero\n"
                + "    <input name=\"number\" type=\"text\" id=\"number\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>Barrio </label>\n"
                + "    <select name=\"district_id\" id=\"district_id\">\n";
        ret += setFields(districts, "id", "name");
        ret += "    </select>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>Ciudad \n"
                + "    <select name=\"city_id\" id=\"city_id\">\n";
        ret += setFields(cities, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>Email &nbsp\n"
                + "    <input name=\"mail\" type=\"text\" id=\"mail\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input name=\"save\" type=\"submit\" id=\"save\" value=\"Enviar\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>";

        return ret;
    }

    /**
     *
     * @param cities cities list
     * @param districts districts list
     * @param ownersowners list
     * @param buildingTypes building type list
     * @return html code for search form
     */
    public static String search(List<City> cities, List<District> districts, List<Owner> owners, List<BuildingType> buildingTypes) {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Buscar</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"Buscar\" name=\"Buscar\" method=\"get\" action=\"\">\n"
                + "  <label></label>\n"
                + "  <p align=\"center\">\n"
                + "    <label>city\n"
                + "    <select name=\"city_id\" id=\"city_id\">\n";
        ret += setFields(cities, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "</p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>district\n"
                + "    <select name=\"district_id\" id=\"district_id\">\n";
        ret += setFields(districts, "id", "name");
        ret += "    </select>\n"
                + "  </label></p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>building Type\n"
                + "    <select name=\"building_type_id\" id=\"building_type_id\">\n";
        ret += setFields(buildingTypes, "id", "type");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>maxPrice\n"
                + "    <input type=\"text\" name=\"maxPrice\" />\n"
                + "    </label>\n"
                + "</p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>owner\n"
                + "    <select name=\"owner_id\" id=\"owner_id\">\n";
        ret += setFields(owners, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input type=\"checkbox\" name=\"sale\" value=\"true\" />\n"
                + "    sale</label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input type=\"checkbox\" name=\"rental\" value=\"true\" />\n"
                + "    rental</label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input name=\"search\" type=\"submit\" id=\"search\" onclick=\"MM_goToURL('parent','/index');return document.MM_returnValue\"/>\n"
                + "    </label></p>\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>";

        return ret;
    }

    /**
     *
     * @param cities cities list
     * @param districts districts list
     * @param owners owners list
     * @param buildingTypes building type list
     * @return html code for new building form
     */
    public static String saveBulding(List<City> cities, List<District> districts, List<Owner> owners, List<BuildingType> buildingTypes) {
        String ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Insertar inmueble</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"    
                + "<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n"
                + "  <label>Tipo de Inmueble\n"
                + "  <select name=\"building_type_id\" id=\"building_type_id\">\n";
        ret += setFields(buildingTypes, "id", "type");
        ret += "  </select>\n"
                + "  </label>\n"
                + "  <p>\n"
                + "    <label>Duenio\n"
                + "    <select name=\"owner_id\" id=\"owner_id\">\n";
        ret += setFields(owners, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Calle\n"
                + "    <input name=\"street\" type=\"text\" id=\"street\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Numero\n"
                + "    <input name=\"number\" type=\"text\" id=\"number\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Barrio\n"
                + "    <select name=\"district_id\" id=\"district_id\">\n";
        ret += setFields(districts, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Ciudad\n"
                + "    <select name=\"city_id\" id=\"city_id\">\n";
        ret += setFields(cities, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Descripcion\n"
                + "    <textarea name=\"description\" id=\"description\"></textarea>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Precio\n"
                + "    <input name=\"price\" type=\"text\" id=\"price\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>\n"
                + "    <input name=\"rental\" type=\"checkbox\" id=\"rental\" value=\"true\" />\n"
                + "    Alquiler</label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>\n"
                + "    <input name=\"sale\" type=\"checkbox\" id=\"sale\" value=\"true\" />\n"
                + "    Venta</label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>\n"
                + "    <input type=\"submit\" name=\"Submit\" value=\"Enviar\" />\n"
                + "    </label>\n"
                + "  </p>"
                + "</form>\n"
                + "</body>\n"
                + "</html>";

        return ret;
    }

    /**
     *
     * @param cities cities list
     * @param districts districts list
     * @param owners owners list
     * @return
     */
    public static String saveRealState(List<City> cities, List<District> districts, List<Owner> owners) {
        String ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Nueva inmobiliaria</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n"
                + "  <label>Nombre\n"
                + "  <input name=\"name\" type=\"text\" id=\"name\" />\n"
                + "  </label>\n"
                + "  <p>\n"
                + "    <label>Calle\n"  
                + "    <input name=\"street\" type=\"text\" id=\"street\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Nro\n"
                + "    <input name=\"number\" type=\"text\" id=\"number\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Barrio\n"
                + "    <select name=\"district_id\" id=\"district_id\">\n";
        ret += setFields(districts, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Ciudad\n"
                + "    <select name=\"city_id\" id=\"city_id\">\n";
        ret += setFields(cities, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Telefono\n"
                + "    <input name=\"phone\" type=\"text\" id=\"phone\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Email\n"
                + "    <input name=\"email\" type=\"text\" id=\"email\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Web\n"
                + "    <input name=\"web\" type=\"text\" id=\"web\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Duenios\n"
                + "    <select name=\"owners\" size=\"5\" multiple=\"multiple\" id=\"owners\">\n";
        ret += setFields(owners, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>\n"
                + "    <input type=\"submit\" name=\"Submit\" value=\"Enviar\" />\n"
                + "    </label>\n"
                + "  </p>"
                + "</form>\n"
                + "</body>\n"
                + "</html>";
        return ret;
    }
}
