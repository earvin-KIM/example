<?php
  session_start();
  if( isset( $_SESSION[ 'id' ] ) ) {
    $jb_login = TRUE;
  }
  else{
      $jb_login = FALSE;
  }
?>