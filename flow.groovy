stage 'configurish'
node {
    stage 'buildingish' 
    node {
        git url: 'https://github.com/ivanmoore/experiment43.git'
        def ttt = thung()
        if (cond()) {
        	echo "thing was ${ttt}"
                stage 'clever'
        } else {
                echo "did not like that"
                stage 'tricky'
        }
    }

    stage 'deployish'
}

def thung(){
    readFile('README.md')
}

def cond(){
    readFile('README.md').contains('x')
}
