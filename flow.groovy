stage 'configurish'
node {
    stage 'buildingish' 
    node {
        git url: 'https://github.com/ivanmoore/experiment43.git'
        def ttt = thung()
        if (true) {
        	echo "thing was ${ttt}"
        } else {
                echo "did not like that"
        }
    }

    stage 'deployish'
}

def thung(){
    readFile('README.md')
}
