def unknown(){
    if ('a string'.length()>0) {
        stage 'big thing'
    } else {
        stage 'small thing'
    }
}

stage 'configurish'
node {
   unknown()
}

stage 'buildingish'
stage 'deployish'
