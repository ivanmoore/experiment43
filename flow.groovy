stage 'configurish'
node {
    stage 'buildingish' 
    node {
        git url: 'https://github.com/ivanmoore/experiment43.git'
        def ttt = thung()
        echo "thing was ${ttt}"
    }

    stage 'deployish'
}

def thung(){
    readFile('README.md')
}
