package tsingjyujing.geo.element.immutable

import tsingjyujing.geo.basic.IGeoPoint

final case class GeoPoint(longitude: Double, latitude: Double) extends IGeoPoint {
    override def getLongitude: Double = longitude
    override def getLatitude: Double = latitude
}
