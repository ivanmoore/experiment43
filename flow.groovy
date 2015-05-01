stage 'configurish'
node {
    stage 'buildingish' 
    node {
        echo 'zoom'
        echo readFile 'README.md'
    }

    stage 'deployish'
}
