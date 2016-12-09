package controllers

import play.api.mvc._

/**
  * Created by iWill on 2016-12-08.
  */
class Application extends Controller {

  def index = Action {
    Ok("Your new application is ready.")
  }

  def cleanup = Action {
    Ok("Your database is clean")
  }

}
