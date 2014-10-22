package concurrency.akka.account

import akka.actor.{ActorSystem, PoisonPill, Props}
import com.typesafe.scalalogging.slf4j.StrictLogging

object AccountApp extends App with StrictLogging {
  val system = ActorSystem("accountSystem")
  val agent1 = system.actorOf(Props[AccountManager], "agent1")
  logger.info("start")
  (1 to 50).foreach {
    i => agent1 ! Create(s"xx$i", 500)
  }
  agent1 ! Report
}
