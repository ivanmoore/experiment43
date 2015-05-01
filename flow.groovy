stage 'configurish'
node {
    stage 'buildingish' 
    node {
        def ttt = thung()
        echo "thing was ${ttt}"
    }

    stage 'deployish'
}

def thung(){
    readFile('README.md')
}
