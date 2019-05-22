package features

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class KarateSimulation extends Simulation {


  val protocol = karateProtocol(

  )

  protocol.nameResolver = (req, ctx) => req.getHeader("karate-name")

  val get = scenario("get").exec(karateFeature("classpath:features/get.feature"))

  setUp (
        get.inject(rampUsers(10) during (5 seconds)).protocols(protocol),

        )

}
