def mapping = readFile 'README.md'

stage 'configurish'
node {
    stage 'buildingish' 
    node {
        echo 'zoom'
        echo mapping
    }

    stage 'deployish'
}
