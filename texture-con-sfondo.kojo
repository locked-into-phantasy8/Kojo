var ns = 8 
var diameter : Double = canvasBounds.width / ns
var radius = diameter / 2 
var edoX = -canvasBounds.width / 2 + radius 
var nsy = 7
var dy : Double = canvasBounds.height / nsy
var ry = dy / 2 
var edoY = -canvasBounds.height / 2 + ry
var sy = 20
var sx = 20

def sfondo { 
  repeat (nsy*sy) {
    setPosition (edoX, edoY) 
  repeat (ns*sx) {
  setPosition (edoX, edoY)
  setPenColor (cm.hsla (random (0, 360), 1, 0.1, 0.01))
  setFillColor (cm.hsla (random (0, 360), 1, 0.6, 0.3))
  circle (randomDouble (diameter/50, diameter/20))
  edoX += diameter/sx
  setPosition (edoX, edoY)
  }
  edoX -= ns*diameter
  edoY += dy/sy
}
}

def mattonella {
  edoY -= nsy*sy*dy/sy-ry
  edoX += diameter - sx*diameter/35
  def block () {
    repeat (18) {
      def shape () {
        var side = randomDouble (radius/4, radius/2)
        repeat (6) {
          forward (side)
          right (60)
          
        }
     
      }
      savePosHe ()
      setPenThickness (random (1, 10))
      setFillColor (cm.hsla (random (0, 360), 1, 0.5, 0.36))
      setPenColor (cm.hsla (random (0, 360), 1, 0.5, 0.36))
      shape ()
      restorePosHe ()
      right (20)
    }
    }
  repeat (nsy) {
    setPosition (edoX, edoY)
    savePosHe ()
   repeat (ns) {
    block 
    edoX += diameter   
    setPosition (edoX, edoY)
  }
  edoX -= ns*diameter
  restorePosHe ()
  edoY += dy
  }
}

clear ()
setSpeed (superFast)
sfondo
mattonella
