(*zadanie 1*)
type 'x result = Success of 'x | Failure of string;;

(*zadanie 2*)
let input_string () =
  let s = read_line () in
  if String.length s = 0 then Failure "Empty string" else Success s;;

let string_to_int s = 
  try
    Success (int_of_string s )
  with
    Failure _ -> Failure "Input dont contains integers";;

let calculate_complementary x =
  let rec calculate_iter x acc =
    if x = 0 then acc
    else
      let len = String.length (string_of_int x) in
      let digit = x / (int_of_float (10. ** (float_of_int (len - 1)))) in
      let acc = (acc * 10) + (9 - digit ) in
      calculate_iter (x - digit * (int_of_float (10. ** (float_of_int (len - 1))))) acc
  in
  if x >= 0 then Success (calculate_iter x 0)
  else Failure "Input is negative";;


(*przykład*)
let f1 ()= 
  let x = input_string () in
  match x with
  | Failure msg -> print_endline msg
  | Success x -> 
    match string_to_int x with
    | Failure msg -> print_endline msg
    | Success x -> 
      match calculate_complementary x with
      | Success comp ->print_int comp; print_endline ""
      | Failure msg -> print_endline msg ;;

f1();;
(*zadanie 3*)

let merge x f = 
  match x with
  | Failure msg -> Failure msg
  | Success x -> f x;;

(*przykład*)
let f2 = 
  let x = input_string() in
  let x = merge x string_to_int in
  let x = merge x calculate_complementary in
  match x with 
  | Success comp -> Printf.printf "Success: %d\n" comp
  | Failure msg -> Printf.printf "Failure: %s\n" msg ;;

(*zadanie 4*)

let (>>=) x f = merge x f;;

(*przykład*)
let f3 () = 
  let x = input_string() in 
  let x = x >>= string_to_int inch
  let x = x >>= calculate_complementary in
  match x with
  | Success comp -> Printf.printf "Success: %d\n" comp
  | Failure msg -> Printf.printf "Failure: %s\n" msg ;;

