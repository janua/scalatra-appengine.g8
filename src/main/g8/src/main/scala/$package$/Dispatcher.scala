package $package$

import org.scalatra.ScalatraServlet

class Dispatcher extends ScalatraServlet {

  get("/") {
    html.emailtemplate.render()
  }

}
