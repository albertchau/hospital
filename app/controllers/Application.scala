package controllers

import play.api._
import play.api.Play.current
import play.api.mvc._
import play.api.db._

object Application extends Controller {

  def index = Action {
//    val conn = DB.getConnection()
//    var outString = "Number is "
//    try {
//      val stmt = conn.createStatement
//      val rs = stmt.executeQuery("SELECT * from users limit 10")
//      while (rs.next()) {
//        outString += rs.getString(1)
//      }
//    } finally {
//      conn.close()
//    }
    Ok(views.html.index("Your new application is ready." + " DOUBLE outString"))
  }

}