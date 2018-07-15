package com.example.slick

import com.codahale.metrics.{MetricRegistry, Slf4jReporter}

object Metrics {
  val metricRegistry = new MetricRegistry
  val reporter = Slf4jReporter.forRegistry(metricRegistry).build()
}
