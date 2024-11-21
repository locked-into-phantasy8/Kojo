val cb = canvasBounds 
var t1 = random(0, 2) 
var t2 = random (0, 2) 
var t3 = random (0, 2) 
// ciascuna delle variabili "t" (di "(coin) toss") rappresenta uno dei tre tiri di moneta per ottenere le linee dell'esagramma
def yang {
forward (cb.width / 10)
}
// la funzione yang descrive la linea intera (che rappresenta, appunto, lo yang)
def yin {
forward (cb.width / 10 /3)
hop (cb.width / 10 /3)
forward (cb.width / 10 /3)
}
// la funzione yin descrive la linea spezzata (che rappresenta, appunto, lo yin)
var repx = 0
var repy = cb.height/60*10
// le variabili "rep" servono per modificare la posizione iniziale con ogni ripetizione del processo e hanno uno scopo puramente grafico. 
def esagramma () {
var t1 = random(0, 2) 
var t2 = random (0, 2) 
var t3 = random (0, 2) 
// ciascuna delle variabili "t" (di "(coin) toss") rappresenta uno dei tre tiri di moneta per ottenere le linee dell'esagramma
setPosition(cb.x + cb.width/6*repx, cb.y + cb.height / 2)
savePosHe ()
setSpeed (slow)
write (t1)
hop (cb.height / 6)
write (t2)
hop (cb.height / 6)
write (t3)
right (180)
left (90)
// questa è la prima parte della generazione dell'esagramma. Simula il tiro delle tre monete, rimpiazzando i risultati di testa o croce con 0 o 1.
var line = t1 + t2 + t3
// la variabile "line" detta se la linea dell'esagramma debba essere aperta o spezzata in base al risultato dei tre tiri di moneta, sfruttando l'addizione. 
setPosition (cb.x, -cb.height/60*30 + repy)
if (line >= 2) {
  yang
}
else {
  yin
}
}
// questa è la seconda parte della generazione dell'esagramma. In base ai risultati dei precedenti tiri di moneta, disegna l'esagramma.
cleari ()
repeat (6) {
esagramma
repx += 1
repy += 10
left (90)
}







