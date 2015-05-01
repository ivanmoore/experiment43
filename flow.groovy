stage 'configurish'
node {
    stage 'buildingish' 
    node {
        echo 'zoom'
    }

    stage 'deployish'
}
