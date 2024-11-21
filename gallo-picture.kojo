val pic1 = Picture.circle (80)
    .withPenColor (red)
    .withFillColor (red)
val pic2 = Picture.rectangle (80, 80)
    .withPenColor (blue)
    .withFillColor (blue)
cleari ()
var r = random(0, 2)
if (r == 1) {
  draw(pic1)
}
else {
  draw(pic2)
}
