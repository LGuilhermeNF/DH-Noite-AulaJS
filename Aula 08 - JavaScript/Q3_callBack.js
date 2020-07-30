function a (callback){
    setTimeout( function(){
      for (i = 10; i > 0; i--){
        console.log(i);
      }
        
      callback();
    }, 3000 );
  }
  
  function b (){
    console.log( 'feliz ano novo' );
  }
  
  a( b );